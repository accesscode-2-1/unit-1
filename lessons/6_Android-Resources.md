## How Android Handles Resources

#### Objective

#### Do Now (Morning)

#### Lesson (Morning)

##### Review of Object Oriented Programming

> Exercises

#### Do Now (Afternoon)

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
|-----------| ---------------------------------------------- |
| drawable/	|                                                |
|           |  Bitmap files (.png, .9.png, .jpg, .gif) or    |
|           |  XML files that are compiled into the          |
|           |  following drawable                            |
|           |                                                |
|           | Bitmap files                                   |
|           | Nine-Patches (re-sizable bitmaps)              |
|           | State lists                                    |
|           | Shapes                                         |
|           | Animation drawables                            |
|           | Other drawables                                |
|           | See Drawable Resources.                        |  
|           |                                                |
|-----------|------------------------------------------------|
| layout/   | XML files that define a user interface layout. |
|-----------|------------------------------------------------|
| mipmap/	| Drawable files for different launcher icon     |
|           | densities.                                     |
|-----------|------------------------------------------------|
| values/   | XML files that contain simple values, such as  |
|           | strings, integers, and colors.                 |



##### Overview of Resource Qualifiers

##### Pixels and density

##### Configuration Changes

#### Assessment

#### Support Materials

[App Resources Docs](http://developer.android.com/guide/topics/resources/index.html)

Textbook: 

Videos:
