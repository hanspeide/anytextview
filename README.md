# AnyTextView
Frustration rise the moment you realise that you cannot use a custom font by setting TextView's android:typeface XML-attribute. AnyTextView relieves your pain by letting you do just that.

## Download
_NOTE! AnyTextView is not yet available in Central, so the artifact has to be installed locally for now. See [this page][1] for details on how to do it._ 


Add the AnyTextView dependency to your pom.xml: 
```xml
<dependency>
  <groupId>com.ctrlplusz</groupId>
  <artifactId>anytextview</artifactId>
  <version>(insert latest version)</version>
</dependency>
```

## How to use:
1) Copy the fonts you want to use into the _assets/fonts_ folder of your project

2) Add your application namespace to the root element in the XML file that is to contain AnyTextView's, e.g
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:foobar="http://schemas.android.com/apk/res/com.foo.bar"
		.. >
```  

3) Instead of using
```xml
<TextView ..>
```
use
```xml
<com.ctrplusz.anytextview.AnyTextView 
	foobar:typeface="FontFileName.ttf" ..> <!-- Where "foobar" is the namespace defined in step 2 -->
```  
 
4) Profit! 		

## License
	Copyright 2013 Hans Petter Eide

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
[1]:https://code.google.com/p/maven-android-plugin/wiki/ApkLib
