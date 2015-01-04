## AnyTextView
[![endorse](https://api.coderwall.com/hanspeide/endorsecount.png)](https://coderwall.com/hanspeide)  

Frustration arise the moment you realise that you cannot use a custom font by setting TextView's and EditText's ```android:typeface``` XML-attribute. AnyTextView is here to relieve your pain.

### Setup
If you're using Gradle (recommended), add the following to your build.gradle file:
```javascript
dependencies {
    compile 'com.ctrlplusz.anytextview:library:[insert latest version here]'
}
```

If you're using Maven, add the following to your pom.xml file:
```xml
<dependency>
  <groupId>com.ctrlplusz.anytextview</groupId>
  <artifactId>library</artifactId>
  <version>[insert latest version here]</version>
  <type>aar</type>
</dependency>
```

Alternatively, [download the .aar][1] and reference it from your project.

### How to use:
1) Copy the fonts you want to use into the _assets/fonts_ folder of your project

2) Add your application namespace to the root element in the XML file that is to contain AnyTextView's, e.g
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:foobar="http://schemas.android.com/apk/res-auto"
		.. >
```  

3) Instead of using
```xml
<TextView ../>

<!-- ... or ... -->

<EditText ../>
```

<!-- ... or ... -->

<Button ../>

use

```xml
<com.ctrlplusz.anytextview.AnyTextView 
	foobar:typeface="FontFileName.ttf" ..> <!-- Where "foobar" is the namespace defined in step 2 -->

<!-- ... or ... -->

<com.ctrlplusz.anytextview.AnyEditTextView 
	foobar:typeface="FontFileName.ttf" ..> 
	
<!-- ... or ... -->

<com.ctrlplusz.anytextview.AnyButton 
	foobar:typeface="FontFileName.ttf" ..> 
```  

 
4) Profit! 		

### Changelog
#### Version 1.2
* Project is now using Gradle instead of Maven for building
* Packaging changed to be .aar instead of .apklib
* Prepared project for release in Central
* Bumped version numbers to 21 (Lollipop)

#### Version 1.1.1
* Added missing .recycle() call on TypedArray
* Bumped targetSdkVersion to 19 (KitKat) 

#### Version 1.1
* Made it possible to use custom typefaces in EditText's using AnyEditTextView. AnyEditTextView's shares cache with AnyTextView's.
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
    
    
[1]:https://oss.sonatype.org/service/local/repositories/releases/content/com/ctrlplusz/anytextview/library/1.2/library-1.2.aar
