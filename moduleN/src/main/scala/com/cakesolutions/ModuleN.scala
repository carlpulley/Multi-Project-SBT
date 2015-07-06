package com.cakesolutions

import akka.actor.ExtendedActorSystem
import akka.actor.Extension

class ModuleN(system: ExtendedActorSystem) extends Extension {

  // Create actors etc. for the extension
  println("ModuleN booted!")

}
