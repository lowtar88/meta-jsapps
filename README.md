This README file contains a Yocto recipe on the contents of the meta-jsapps layer.

Please see the corresponding sections below for details.

Dependencies
============

  URI: <first dependency>
  branch: <branch name>

  URI: <second dependency>
  branch: <branch name>

  .
  .
  .

Patches
=======

Please submit any patches against the meta-jsapps layer to the xxxx mailing list (xxxx@zzzz.org)
and cc: the maintainer:

Maintainer: XXX YYYYYY <xxx.yyyyyy@zzzzz.com>

Table of Contents
=================

  I. Adding the meta-jsapps layer to your build
 II. Misc


I. Adding the meta-jsapps layer to your build
=================================================

Run 'bitbake-layers add-layer meta-jsapps'

II. Misc
========
jsapps_0.1.bb is the main recipe for the helloworld test application.   
The tar of helloworld pacakge is located at 'files' and denoted as SRC_URI in the recipe.   
[**info**] 1. the name of subdirectory '**files**' is one of the default search paths regarded by Yocto.   
[**info**] 2. The tar file will be identified automatically and decompressed to ***S*** by Yocto.


The actual source code is at the 'files/mybuild', and be sure that the subdirectory name ***mybuild*** should be also presented in <span style="color:red"> S = "${WORKDIR}/***mybuild***"</span> so that the 'mybuild' created in your tmp work directory is the main place for building your package.
