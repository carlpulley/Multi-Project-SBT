package com.cakesolutions

import akka.actor.ActorSystem
 
object ModuleNBoot extends App {
  
  val system = ActorSystem("Example")

  // etc.
  println("Main booted!")

}
