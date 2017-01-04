import akka.actor.Actor.Receive
import akka.actor.{Actor, ActorSystem, Props}
// Define message
    case class WhoToGreet(who:String)
    // Define actor to handle message

    class Greeter extends Actor {

      def receive ={
        case WhoToGreet(who) => println(s"Hello $who")
      }
    }

object HelloAkkaScala extends App {

    // create a "Hello Akka" actor system
      val system = ActorSystem("Hello-Akka")
    // create a greeter actor
    val greeter = system.actorOf(Props[Greeter],"greeter")
      // send message

       greeter ! WhoToGreet("Paramesh")

  }