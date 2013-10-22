scala-plugin.g8
===================

Giger8 template for Eclipse plugins developed in Scala.

This template produces 5 Eclipse plugins:

* the plugin itself
* the `plugin.tests` fragment
* an Eclipse feature
* an Eclipse source feature
* an Eclipse update-site

The projects can readily be imported inside Eclipse. Additionally, you have maven `pom` files
based on Tycho, enabling command line builds.

## Requirements

You have giter8 in your ``$PATH``. If you don't, please follow the instructions [here](https://github.com/n8han/giter8) 
for how to install it.

## Create your project

```bash
$ git git@github.com:scala-ide/scala-plugin.g8.git
$ g8 file://scala-plugin.g8/
name [Scala Sample plugin]: myplugin   
provider [org.example]: com.mycompany
pluginName [org.example.plugin]: com.mycompany.myplugin
className [SampleAction]: MyPlugin
providerName [Scala IDE]: MyCompany 

Template applied in ./myplugin
$ cd myplugin
```

## Build your project

The produced project is using a plain maven build, so just go ahead an type ``mvn clean install``