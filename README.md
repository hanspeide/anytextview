# AnyTextView
Frustration rise the moment you realise that you cannot use a custom font by setting TextView's android:typeface XML-attribute. AnyTextView relieves your pain by letting you do just that.

## How to use:
Copy the contents of the folder anytextview into your project, and make necessary adjustments:

1) Copy the fonts you want to use into the assets/fonts folder  

2) Add the AnyTextView namespace to the root element in the XML file that is to contain AnyTextView's, e.g
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:anytextview="http://schemas.android.com/apk/res/com.ctrlplusz.anytextview"
		.. >
```  

3) Instead of using
```xml
<TextView ..>
```
use
```xml
<com.ctrplusz.anytextview.AnyTextView 
	anytextview:typeface="Roboto" ..>
```
(where typeface is the filename of the font you want to use, excluding its format) 
 
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