---
layout: post
title:  "What Is Presenter First?"
date:   2016-05-23
---

Presenter First is an MVP variant that decouples domain and UI code in order to maximize testability. It prescribes a mix of architecture and practice in order to accomplish these goals.

Dianne Hackborn wrote [a post][hackborn-post] about the Android framework team's we-don't-care opinion on MVC and app architecture structure.

> ... we really don't care how you organize the flow inside.  Make it all one activity with  manual changes to its views, use fragments ... or some other framework, or split it into additional internal activities.  Or do all three as needed.  As long as you are following the high-level contract of the activity (it launches in the proper state, and saves/restores in the current state), it doesn't matter...

In the absence of some structured "flow" in an Android app, there are a few problems that occur often.

Activity and Fragment classes can become god objects. Once that happens it is very difficult to separate the UI from the database from the networking code to make it testable. There is integration testing, of course, but that requires starting the Android runtime for each test. My personal experience is that once to get to about 25 integration tests, they take so long to run that people lose interest in maintaining them. It  certainly doesn't encourage TDD because of the punitive time to execute.

Presenter First was not invented for mobile apps. It was conceived though, to address software with heavy user  interaction. By definition of course, mobile apps are heavily interactive. That makes Presenter First a good fit for mobile development.

For a long time, Android had a pass on unit testing because it was perceived to be difficult and inefficient. Those days are past and Android apps are expected to be well tested with high coverage. Presenter First provides a solid combination of architecture and practices to make TDD a reality on Android projects.

- Diagram
- Architecture
  - MVP Triad
  - Presenters directly invoke model and view methods
  - Models and views can only post events for the presenter
- Practice
  - TDD
  - Don't start with Views
- Example

[hackborn-post]:[https://plus.google.com/105051985738280261832/posts/FXCCYxepsDU]
[god-object]: [https://en.wikipedia.org/wiki/God_object]
