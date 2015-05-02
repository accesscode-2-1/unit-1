## How Android Handles Resources

#### Objective

#### Do Now (Morning)

Title: Ship, CruiseShip, and CargoShip 

Design a Ship class that the following members:
- A field for the name of the ship (a string).
- A field for the year that the ship was built (a string).
- A constructor and appropriate accessors and mutators.
- A toString method that displays the ship's name and the year it was built.

Design a CruiseShip class that extends the Ship class. The CruiseShip class should have the following members:
- A field for the maximum number of passengers (an int).
- A constructor and appropriate accessors and mutators.
- A toString method that overrides the toString method in the base class.

The CruiseShip class's toString method should display only the ship's name and the maximum number of passengers.

Design a CargoShip class that extends the Ship class. The CargoShip class should have the following members:
- A field for the cargo capacity in tonnage (an int).
- A constructor and appropriate accessors and mutators.
- A toString method that overrides the toString method in the base class.

The CargoShip class's toString method should display only the ship's name and the ship's cargo capacity.

Demonstrate the classes in a program that has a Shiparray. 

Assign various Ship, CruiseShip, and CargoShip objects to the array elements. 

The program should then step through the array, calling each object's toString method. ( use polymorphism )


#### Lesson (Morning)

##### Review of Object Oriented Programming

[ inheritance and interfaces ] ( https://github.com/accesscode-2-1/unit-1/blob/master/lessons/2_Interfaces-And-Inheritance/inheritance.md )
<br />
[ generics tutorial ] ( https://github.com/davisRoman/generics/blob/master/generics_tutorial.md )
> Exercises

#### Abstract Superclass Shape and Its Concrete Subclasses
![ uml diagram ] ( ../images/ExerciseOOP_ShapeAbstract.png )

Create the superclass Shape and its subclasses Circle, Rectangle and Square, as shown in the class diagram.

In this exercise, Shape shall be defined as an abstract class, which contains:
- Two protected instance variables color(String) and filled(boolean). The protected variables can be accessed by its subclasses and classes in the same package. They are denoted with a '#' sign in the class diagram.
Getter and setter for all the instance variables, and toString().
- Two abstract methods getArea() and getPerimeter() (shown in italics in the class diagram).
- The subclasses Circle and Rectangle shall override the abstract methods getArea() and getPerimeter() and provide the proper implementation. They also override the toString().
- Write a test class to test these statements involving polymorphism and explain the outputs. Some statements may trigger compilation errors. Explain the errors, if any.

```java
Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
System.out.println(s1);                    // which version?
System.out.println(s1.getArea());          // which version?
System.out.println(s1.getPerimeter());     // which version?
System.out.println(s1.getColor());
System.out.println(s1.isFilled());
System.out.println(s1.getRadius());
   
Circle c1 = (Circle)s1;                   // Downcast back to Circle
System.out.println(c1);
System.out.println(c1.getArea());
System.out.println(c1.getPerimeter());
System.out.println(c1.getColor());
System.out.println(c1.isFilled());
System.out.println(c1.getRadius());
   
Shape s2 = new Shape();
   
Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
System.out.println(s3);
System.out.println(s3.getArea());
System.out.println(s3.getPerimeter());
System.out.println(s3.getColor());
System.out.println(s3.getLength());
   
Rectangle r1 = (Rectangle)s3;   // downcast
System.out.println(r1);
System.out.println(r1.getArea());
System.out.println(r1.getColor());
System.out.println(r1.getLength());
   
Shape s4 = new Square(6.6);     // Upcast
System.out.println(s4);
System.out.println(s4.getArea());
System.out.println(s4.getColor());
System.out.println(s4.getSide());
  
// Take note that we downcast Shape s4 to Rectangle, 
//  which is a superclass of Square, instead of Square
Rectangle r2 = (Rectangle)s4;
System.out.println(r2);
System.out.println(r2.getArea());
System.out.println(r2.getColor());
System.out.println(r2.getSide());
System.out.println(r2.getLength());
   
// Downcast Rectangle r2 to Square
Square sq1 = (Square)r2;
System.out.println(sq1);
System.out.println(sq1.getArea());
System.out.println(sq1.getColor());
System.out.println(sq1.getSide());
System.out.println(sq1.getLength());
```

#### What is the usage of the abstract method and abstract class?

#### Do Now (Afternoon)
- Work with the person next to you and code review each others' Thursday in-class assignment.
- Work with the person next to you and code review each others' homeworks.

#### Lesson (Afternoon)

##### Overview of Android Resource Directories


You should always externalize resources such as images and strings from your application code, so that you can maintain them independently. Externalizing your resources also allows you to provide alternative resources that support specific device configurations such as different languages or screen sizes, which becomes increasingly important as more Android-powered devices become available with different configurations. In order to provide compatibility with different configurations, you must organize resources in your project's `res/` directory, using various sub-directories that group resources by type and configuration.


For any type of resource, you can specify `default` and `alternative` resources for your application:

- Default resources are those that should be used regardless of the device configuration or when there are no alternative resources that match the current configuration.
- Alternative resources are those that you've designed for use with a specific configuration. To specify that a group of resources are for a specific configuration, append an appropriate configuration qualifier to the directory name.

![ picture 1 ] ( ../images/resource_devices_diagram1.png )
<br />
Figure 1. Two different devices, each using the default layout (the app provides no alternative layouts).


<br />

![ picture 2 ] ( ../images/resource_devices_diagram2.png )
<br />
Figure 2. Two different devices, each using a different layout provided for different screen sizes.


### Providing Resources
You should always externalize application resources such as images and strings from your code, so that you can maintain them independently. You should also provide alternative resources for specific device configurations, by grouping them in specially-named resource directories. At runtime, Android uses the appropriate resource based on the current configuration.

Once you externalize your application resources, you can access them using resource IDs that are generated in your project's R class. 

Grouping Resource Types
You should place each type of resource in a specific subdirectory of your project's res/ directory. For example, here's the file hierarchy for a simple project:

```
MyProject/
    src/  
        MyActivity.java  
    res/
        drawable/  
            graphic.png  
        layout/  
            main.xml
            info.xml
        mipmap/  
            icon.png 
        values/  
            strings.xml 
```

As you can see in this example, the res/ directory contains all the resources (in subdirectories): an image resource, two layout resources, mipmap/ directories for launcher icons, and a string resource file. 


| Folder    | Resource Type                                  |
|-----------|------------------------------------------------|
| drawable/	|                                                |
|           |  Bitmap files (.png, .9.png, .jpg, .gif) or    |
|           |  XML files that are compiled into the          |
|           |    following drawable                          |
| --------- | ---------------------------------------------- |
| layout/   | XML files that define a user interface layout. |
| --------- | ---------------------------------------------- |
|           |                                                |
| mipmap/	| Drawable files for different launcher icon     |
|           | densities.                                     |
| --------- | ---------------------------------------------- |
|           |                                                |
| values/   | XML files that contain simple values, such as  |
|           | strings, integers, and colors.                 |


### Providing Alternative Resources

Almost every application should provide alternative resources to support specific device configurations. For instance, you should include alternative drawable resources for different screen densities and alternative string resources for different languages. At runtime, Android detects the current device configuration and loads the appropriate resources for your application.

To specify configuration-specific alternatives for a set of resources:

Create a new directory in `res/` named in the form `<resources_name>-<config_qualifier>`

- <resources_name> is the directory name of the corresponding default resources

- <qualifier> is a name that specifies an individual configuration for which these resources are to be used 

You can append more than one <qualifier>. Separate each one with a dash.

For example, here are some default and alternative resources:

```
res/
    drawable/   
        icon.png
        background.png    
    drawable-hdpi/  
        icon.png
        background.png  
```

The hdpi qualifier indicates that the resources in that directory are for devices with a high-density screen. The images in each of these drawable directories are sized for a specific screen density, but the filenames are exactly the same. This way, the resource ID that you use to reference the icon.png or background.png image is always the same, but Android selects the version of each resource that best matches the current device, by comparing the device configuration information with the qualifiers in the resource directory name.

##### Overview of Resource Qualifiers

Various to choose from:
- Language and region	
  Examples: en, fr, en-rUS, fr-rFR, fr-rCA

- Screen pixel density (dpi)
  Examples: ldpi, mdpi, hdpi, xhdpi

# Accessing Resources
Once you provide a resource in your application (discussed in Providing Resources), you can apply it by referencing its resource ID. All resource IDs are defined in your project's R class, which the aapt tool automatically generates.

When your application is compiled, aapt generates the R class, which contains resource IDs for all the resources in your res/ directory. For each type of resource, there is an R subclass (for example, R.drawable for all drawable resources), and for each resource of that type, there is a static integer (for example, R.drawable.icon). This integer is the resource ID that you can use to retrieve your resource.


Although the R class is where resource IDs are specified, you should never need to look there to discover a resource ID. A resource ID is always composed of:

The resource type: Each resource is grouped into a "type," such as string, drawable, and layout. For more about the different types, see Resource Types.
The resource name, which is either: the filename, excluding the extension; or the value in the XML android:name attribute, if the resource is a simple value (such as a string).
There are two ways you can access a resource:

`In code:` Using a static integer from a sub-class of your R class, such as:
R.string.hello
string is the resource type and hello is the resource name. There are many Android APIs that can access your resources when you provide a resource ID in this format. See Accessing Resources in Code.
<br />
`In XML:` Using a special XML syntax that also corresponds to the resource ID defined in your R class, such as:
@string/hello
string is the resource type and hello is the resource name. You can use this syntax in an XML resource any place where a value is expected that you provide in a resource. See Accessing Resources from XML.


##### Pixels and density

- dots per inch (dip) - resolution divided by screen area
- density independent pixels (dp)

![ pic1 ] ( ../images/density.png )
<br />
![ pic2 ] ( ../images/pixel-density-3.png )
<br />
[ density independent pixels - youtube ] (https://www.youtube.com/watch?v=zhszwkcay2A)


##### Configuration Changes

#### Assessment

#### Support Materials

[App Resources Docs](http://developer.android.com/guide/topics/resources/index.html)

Textbook: Please read:
- "Some words about Resources" p117
- "Tutorial #4 - Adjusting our resources" p131

Videos: https://youtu.be/YhRCAZNIu-c
