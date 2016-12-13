#School#
School.java will be my main class.
##Application##
I will use MySQL to store the information and I will be using json files to seed my database.  
There will be very basic functionalities like students enrolling to a course and leaving a course.  
Teacher owning a course. Some basic rules like Courses can have no teacher and Admin will have method  
that will expand its scope throughout all the models in the application.  

###Models###
Admin
Course  
Student  
Teacher  

###Relationships###
Student has many courses  
Teacher has many courses  
Course has one Teacher 

##Testing##
I have not looked into java testing but I am familiar with JUnit so I might just end up using that.  

## ERD ##
![alt text](http://i.imgur.com/WSZBY06.png "ERD School DB")

## Database ##
** MUST BE USING NETBEANS AS IDE **  
1. create a database named "school" with username "dummy" and password "password"  
![alt text](http://i.imgur.com/uDR71lJ.png "First step db")  
2. create a new connection and connect to the newly created database  
![alt text](http://i.imgur.com/QCOf715.png "Second step db")  
3. now we need to add a library to our project that will allow us to connect to our database  
![alt text](http://i.imgur.com/RtjApQx.png "Third step db")  
4. you can now connect to the database through the application  
![alt text](http://i.imgur.com/4nk78t7.png "Fourth step db")  
