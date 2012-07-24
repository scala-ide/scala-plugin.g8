scala-ide-plugin.g8
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

## Note:

By default, the maven build is performed with the stable version of Scala (2.9).
The available profiles are:

* `scala-2.9` (default)
* `scala-trunk`

Run maven like this:

    mvn -P scala-trunk clean install
