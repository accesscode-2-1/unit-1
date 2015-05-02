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

##### Overview of Resource Qualifiers

##### Pixels and density

##### Configuration Changes

#### Assessment

#### Support Materials

[App Resources Docs](http://developer.android.com/guide/topics/resources/index.html)

Textbook: 

Videos:
