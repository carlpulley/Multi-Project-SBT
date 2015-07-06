package com.cakesolutions

import akka.actor.ExtensionId
import akka.actor.ExtensionIdProvider
import akka.actor.ExtendedActorSystem
 
object ModuleNExtension extends ExtensionId[ModuleN] with ExtensionIdProvider {
  
  override def lookup = ModuleNExtension
 
  override def createExtension(system: ExtendedActorSystem) = new ModuleN(system)

}
