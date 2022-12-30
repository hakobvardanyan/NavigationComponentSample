# Jetpack Navigation Component: Manual Implementation of Multiple Back Stacks
The repository contains multiple back stacks manual implementation for a custom views as well as custom logic for the system back navigation.

Check detailed information in this **[article](https://medium.com/@hakvardanyan/jetpack-navigation-component-manual-implementation-of-multiple-back-stacks-62b33e95795c)**

Navigation scheme for menu in this repository is following:

![Component 10](https://user-images.githubusercontent.com/24206808/209818369-d94df05e-c1e4-4efc-a1b3-7b6477d0a7fb.png)

In addition you can find:
* A separate nested authentication graph
* A separate invest graph which opens on top of menu flow
* Fragment transition animations
* Shared ViewModel in scope of main fragment to for communication with nested flows
* Splash screen from which app decides where to navigate

You can check **[this](https://github.com/hakobvardanyan/NavigationComponentSample/tree/multiple-back-stack-support-by-xml-actions)** branch for implementation of supporting multiple back stacks using global actions in XML.
