## Layouts

### Do Now

### Lesson: Layouts

#### Views and View Groups

A View is the building block of a basic UI element. Views are bounded by a rectangle and are in charge of event
handling and drawing. A Widget is a type of View. A ViewGroup is also a type of View.

A ViewGroup is a container class that contains other Views, including ViewGroups. Layouts are a type of ViewGroup. 

#### Layout Basics

Layouts define the structure of a user interface, typically in the XML, although you can dynamically create
the UI in Java. 

When loading a layout, call `setContentView`. You have probably seen this in your `onCreate`, but take note that
you can change the layout at any time. Activities are not implicitly associated with layouts.

A Layout is a rectangle - the boundaries of the a Layout are defined by `getLeft()`, `getRight()`, `getTop()`, and
`getBottom()`. You can also use `getHeight()` and `getWidth()` to get the actual size of the Layout box.

#### Linear Layout

In a Linear Layout, all the children are aligned either horizontally or vertically, depending on the
`android:orientation`. That is, all the children are placed one after another linearly.

* Orientation: Vertical for rows, horizonatal for columns.
* Gravity: [Gravity and layout_gravity](http://sandipchitale.blogspot.com/2010/05/linearlayout-gravity-and-layoutgravity.html)
* Weight: Weight describes the relative importance of the Views, which allows these views to expand to fit the
parent proportionally. For example, two views with a weight of 1 will fill the layout at a 1:1 ratio (or, the same
amount), and two views with weights of 1 and 2 will fill the layout with a 1:2 ratio (so, 1/3 and 2/3 of the screen).

#### Relative Layout

In a Relative Layout, the children can define their position relative to the parent or the other children available.

#### Exercises

> Create a form using a Linear Layout that asks a user for first and last name, username, DOB, etc.


> Create a calculator layout using a Linear Layout. Use this opportunity to figure out how to nest layouts.

#### Quiz
