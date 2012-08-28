#Lambchop

Example web app that uses Java 8 on Heroku.

#To Use
Specify the java buildpack (to get the latest) and push.

> Note: because of some testing going on, you may have to
push a couple times to get it to detect Java 8.

`$ git clone git://github.com/naamannewbold/lambchop.git`

`$ heroku create --buildpack https://github.com/heroku/heroku-buildpack-java.git`

`$ git push heroku master`
