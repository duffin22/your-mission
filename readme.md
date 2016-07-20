---
title: Content Providers Lab
duration: "2:00"
creator:
    name: Brad Zimmerman
    city: SEA
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Your Mission
Week 4 | Lesson 4

## Introduction

You have been recruited as a new employee at the Mi6:Q division straight out of your graduation from General Assembly. Your mission, should you choose to accept it, is to make a fake application to put on the phones of enemies of 007 so that we can track their communications.

Take a quick look at the dossier for your first mark. Your app should be designed to distract him with maximum efficiency while we analyze his data. M would also like a personal copy of your report sent to her email. Make sure she gets it!

## Dossier

### Sergei Ivanovich

![](http://www.sickchirpse.com/wp-content/uploads/2013/12/Russia-With-Love-Social-Network-8.jpg)

#### Likes
  - Bad European Electronic Music
  - Cats
  - Videos
  - Mother Russia

#### Dislikes
  - When a video ends
  - Pictures
  - Reading

## Exercise
#### Requirements

- Copy the messages and contacts of a user's phone when your application is run on it. Remember that M needs the name and the phone number for each contact.
- Use a VideoView to distract Sergei while you are stealing his information.
- Don't include anything Sergei doesn't like in your application.
- Send an email to an address with the stolen information when the VideoView is clicked.

**Bonus:**
- Steal more things besides Sergei's contacts and messages
- Make your application super annoying and distracting (while following the guidelines above)

#### Notes

- Don't worry about formatting. As long as M gets the information, she's happy.
- Don't worry about a popup when you are sending an email. We will have our senior engineers flush that out a little bit more.
- Remember to call a content resolver, use the code below

```java
  Cursor cursor = getContentResolver().query(Uri.parse("content://sms/"), null, null, null, null);
```

- To send an email, take a look at the resources below

### RESOURCES

[Sending an email in Android](http://www.tutorialspoint.com/android/android_sending_email.htm)
