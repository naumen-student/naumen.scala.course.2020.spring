package task_3

object Main extends App {
  val myName = "Ivan Svirskiy"
  val greetings = Array("Привет","Hola","Shalom","cześć","zdravo")
  val greetingFunc = (name:String,  greeting:String)=> println(s"$greeting Scala! This is $name")
  val nameArray = Array(myName,myName.reverse)
  for(name <-nameArray){
    for(greeting <- greetings){
      greetingFunc(name,greeting)
    }

  }
  nameArray.foreach(x=>greetings.foreach(z=>greetingFunc(x,z)))
}
