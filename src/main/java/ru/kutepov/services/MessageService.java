package ru.kutepov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kutepov.repository.MessageRepository;
import ru.kutepov.entity.Message;

import java.util.List;

@Service
public class MessageService extends AbstractService<Message, Long> {

  private MessageRepository repository;


  @Autowired
  public MessageService(MessageRepository repository) {
    super(repository);
    this.repository=repository;
  }

  public List<Message> findById(Integer id) {
    return repository.findById(id);
  }
}
