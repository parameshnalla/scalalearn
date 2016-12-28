package com.paramesh

object time {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  // Ctrl + shift + f

  class Time(h: Int,m: Int = 0) {

    private var minutesSinceMidNight = h * 60 + m

    def hours = minutesSinceMidNight / 60

    def minutes = minutesSinceMidNight % 60

    def minutes_=(newValue: Int) {
      if (newValue < 0 || newValue >= 0) throw new IllegalArgumentException
      minutesSinceMidNight = hours * 60 + newValue
    }

    if (h < 0 || h >= 24 || m < 0 || m >= 60) throw new IllegalArgumentException
    
    def before(that:Time) = minutesSinceMidNight  < that.minutesSinceMidNight

    override def toString = f"${hours}:${minutes}"
    
  }
  
  val morning = new Time(9,0)                     //> morning  : com.paramesh.time.Time = 9:0
  val afternoon = new Time(12,30)                 //> afternoon  : com.paramesh.time.Time = 12:30
  //val wrongTime = new Time(26,69)
  morning.before(afternoon )                      //> res0: Boolean = true
  afternoon .before(morning )                     //> res1: Boolean = false
  
  val noon = new Time(2)                          //> noon  : com.paramesh.time.Time = 2:0
  // default value for min is 0
  noon.hours                                      //> res2: Int = 2
  //noon.hours = 3
 // this won't execute as hours variable mutator not defined.
  
}