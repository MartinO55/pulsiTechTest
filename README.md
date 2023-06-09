# Design Brief

As a technical test for the interview, we typically ask you to demonstrate your ability to learn new technologies. We would like you to prototype a small Web application using Metawidget. You need spend no more than an hour (though you certainly can if you like).

The prototype only needs to be a single page (it can be more if you prefer). It should use some client-side JavaScript (Metawidget supports several) and Metawidget to collect some data, and demonstrate it being saved in some way (either to the console, sent over a REST API, etc). Bonus points for collecting data in a nested structure (such as person->address->city), implementing one-to-many relationships (such as collecting a person's children's names), and other creative enhancements! Source code comments are highly regarded.

Here are some useful starting links:

<http://blog.kennardconsulting.com/2013/08/how-to-generate-ui-from-json-objects.html>
<https://github.com/metawidget/metawidget-js/blob/master/examples/angular/with-json-schema.html>
<http://blog.kennardconsulting.com/2014/05/angularjs-create-editable-tables-with.html>
<http://metawidget.org/doc/reference/en/html/ch01s02.html>

There is lots more documentation available at <http://metawidget.org>, <http://blog.kennardconsulting.com>, and other sources.

## Implementation

Okay, So we need to build a frontend website, and maybe a backend that deals with people - if I am reading the directions correctly, console logging the data entered in the front end would be sufficient, but we can do a backend pretty quickly with spring, although deploying it may be tough. the frontend is just built with basic javascript, although for any real project you would do it with react or something else. For this, it works, although it isn't pretty. My reasoning here is that I have had issues deploying react applications to free hosting platforms before, and I don't want to end up with a mime type error turning the application into a blank page because I can't fiddle with how github pages or netlify sends the data. Styling is done with SASS - although it is pretty basic. obviously you could use bootstrap or metawidgets inbuilt tools, but I actually enjoy writing CSS code.

Update: Have technically completed the mvp (I think); we have a web page that uses metawidget as a form that console logs any change to the data you enter. It then reloads the original data because it is just pulling from a static json file. Currently it keeps the address nested, although it doesn't work with family members; presumably soemthing to do with the way the JSON array is configured. At this point I think the next step is to build out a quick backend for the project, because this is a full stack job.

Update: Have Added a backend built in spring to the project. Full disclosure, I have just reused a lot of code I wrote for a previous project, which is why it only took an hour and a half.

Update: The server connects to the backend, and the backend can talk to the frontend - or at at least it makes the get all data request. no data currently exists in the server. I will put some data in in postman, then hook the update function to the submit button. At that point we get to see what it will look like.

Update: So we have hooked the frontend to the backend, and are displaying the data in the metawidget. However, we can't manipulate the internals of the genereated table - i.e. I have been trying to add a button to each row of the table inline, but without success

Update: Gave up on the button thing, I just don't think its possible without a really deep dive into metawidget, and I don't have time to figure it out. instead, I cheated and added all the buttons to the top row and moved them around with css. Otherwise the current issue is the lack of time to go back and do a refactor to hook everything up to the CRUD - I need to rewrite the frontend to do that

Update: have added a new page for the create person form - it console logs the data or sends it to the server if its up. not styled yet but it might be before submission

## Tech Stack

- HTML
- SASS/SCSS
- Javascript
- Spring Boot
- MySQL workbench
- MySQL

## Installation and Running

You will need: mysql workbench, Springboot.

Configure the sql server in workbench with the title "pulsitechtest".

In "backend\techtest\src\main\resources\application.properties", alter the "spring.datasource.url" variable to reflect your localhost settings for the server above. If you used a different name for the server, enter it here.

Run the App.java file to start the spring boot server.

open index.html in the frontend folder.
