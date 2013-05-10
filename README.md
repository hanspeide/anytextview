## AnyTextView
[![endorse](https://api.coderwall.com/hanspeide/endorsecount.png)](https://coderwall.com/hanspeide)  

Frustration arise the moment you realise that you cannot use a custom font by setting TextView's ```android:typeface``` XML-attribute. AnyTextView is here to relieve your pain.

### Download
Add AnyTextView as a dependency in your pom.xml(s):
```xml
<dependency>
  <groupId>com.ctrlplusz</groupId>
  <artifactId>anytextview</artifactId>
  <version>[insert latest version her]</version>
  <type>apklib</type>
</dependency>
```

Alternatively, [download the .apklib][1] and reference it from your project. If you're using Eclipse you must
unzip the .apklib, and reference the extracted project. 

### How to use:
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
<TextView ../>
<!-- ... or ... -->
<EditText ../>
```
use
```xml
<com.ctrplusz.anytextview.AnyTextView 
	foobar:typeface="FontFileName.ttf" ..> <!-- Where "foobar" is the namespace defined in step 2 -->
<!-- ... or ... -->
<com.ctrplusz.anytextview.AnyEditTextView 
	foobar:typeface="FontFileName.ttf" ..> 
```  
 
4) Profit! 		

### Changelog
#### Version 1.1
* Made it possible to use custom typefaces in EditText's using AnyEditTextView. AnyEditTextView's share cache with AnyTextView's.
* minSdkVersion set to 4
* No longer tries to render typefaces if code is running in a visual editor

#### Version 1.0
* Use custom typefaces in TextView's using AnyTextView


### License
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
    
    
[1]:http://search.maven.org/remotecontent?filepath=com/ctrlplusz/anytextview/1.1/anytextview-1.1.apklib
