# todo-jpa

1.In this project,created complete backend api's integrating with database.
2.2.First I have created model package,controller package,repository package.
3.I have todo pojo(Plain Old Java Object) class.
4.In Controller Class,I have created endpoints for GET,POST,PUT,DELETE.
5.GET:-For getting all todos from database.
6.POST:-For adding todos into database.
7.PUT:-For updating the todos which are in the database.
8.DELETE:-For Deleting the todods from the database.
9.I have created Todorepository in which i have done dependency injection of Jdbc template for connecting to database and used that jdbcTemplate for querying purpose.
10.I have created userrepository in which i have done dependency injection of Jdbc template for connecting to database and used that jdbcTemplate for querying purpose.
11.All database related details i have kept in application.properties file.
-------------BELOW ARE MY API'S WHICH HAVE users's---------------------
11.POST:-http://localhost:8080/api/user/login
12.POST:-http://localhost:8080/todo/api/user/register

