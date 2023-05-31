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

## Tech Stack

- HTML
- SCSS
- Javascript
- Spring Boot
- MySQL workbench
- MySQL
