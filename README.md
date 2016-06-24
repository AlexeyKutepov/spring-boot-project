# Spring Boot Example
Requirements:
It is a Spring Boot (+ H2 in memory DB) app. 
It involves simple web UI, DB and 3rd party REST service. 

It shows a web page with following:
- Post Id (Input text, numbers only)
- Submit button
- A list with all previous successful results from DB (see details below)

After submitting the form, the data (post id) goes to the server via REST. 
Then, the server sends a request to 3-rd party service:

http://jsonplaceholder.typicode.com/posts/{post_id}

Then, it saves successful response to DB, which are displayed on the page. 

