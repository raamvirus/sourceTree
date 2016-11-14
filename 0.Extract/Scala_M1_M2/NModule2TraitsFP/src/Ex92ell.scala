
// function apply takes another function f and a value v and applies function f to V
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}
object Main12a extends App {
  def apply(f: Int => String, v: Int) = f(v)
  val decorator = new Decorator("[", "]")
  println(apply(decorator.layout, 7))
  println(apply(decorator.layout, 123))
}