package ru.kutepov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import ru.kutepov.common.Result;
import ru.kutepov.entity.Message;
import ru.kutepov.services.MessageService;

@Controller
public class WebController {

  @Autowired
  public MessageService messageService;

  @RequestMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/getresult")
  public String getResult(@RequestParam(value="postId") Integer postId, Model model) {
    Result result = null;
    try {
      RestTemplate restTemplate = new RestTemplate();
      result = restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts/" + postId, Result.class);
    } catch (Exception e) {
      model.addAttribute("postId", "Can't get data for Post Id " + postId);
      return "error";
    }
    if (result == null) {
      model.addAttribute("postId", "Can't get data for Post Id " + postId);
      return "error";
    }
    Message message = new Message();
    message.setId(result.getId());
    message.setUserId(result.getUserId());
    message.setTitle(result.getTitle());
    message.setBody(result.getBody());
    messageService.save(message);

    model.addAttribute("messages", messageService.findAll());

    return "display";
  }

}
