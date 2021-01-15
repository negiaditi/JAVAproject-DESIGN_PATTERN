# JAVAproject-DESIGN_PATTERN


YOU CAN SEE THE VIDEO OF THE RUNNING CODE HERE-https://www.youtube.com/watch?v=TXlV8AUtZrY&feature=youtu.be


PIZZA WORLD-project title
(AP LAB II PROJECT)

Contributors-ABHAY GARG, ADITI NEGI

PROJECT PROBLEM
We have a Pizza shop which makes two types of pizzas one is Italian and
other one is Veggie. In both types of pizzas we provide three types of
condiments : Oil, Vinegar, Butter. We offer 3 types of meat(Pork,
Pepperoni, Chicken) and several types of veggies. Customer can order any
pizza based on their preference.



In this project we have used Template Method Design Pattern.
Template method design pattern is used to define an algorithm as a
skeleton of operations and leave the details to be implemented by the child
classes. The overall structure and sequence of the algorithm is preserved by
the parent class.
Template means Preset format like HTML templates which has a fixed
preset format. Similarly in the template method pattern, we have a preset
structure method called template method which consists of steps. This
steps can be an abstract method which will be implemented by its
subclasses.
This behavioral design pattern is one of the easiest to understand and
implement. This design pattern is used popularly in framework
development. This helps to avoid code duplication also.
AbstractClass contains the templateMethod() which should be made final
so that it cannot be overridden. This template method makes use of other
operations available in order to run the algorithm but is decoupled for the
actual implementation of these methods. All operations used by this
template method are made abstract, so their implementation is deferred to
subclasses.
ConcreteClass implements all the operations required by the
templateMethod that were defined as abstract in the parent class. There can
be many different ConcreteClasses.
