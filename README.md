# ToasterExample [![](https://jitpack.io/v/fitareq/ToasterExample.svg)](https://jitpack.io/#fitareq/ToasterExample)
# How to 
To get this project into your build:
### Step 1 
Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
### Step 2
Add the dependency

```
dependencies {
	        implementation 'com.github.fitareq:ToasterExample:1.0.2'
	}
 ```
  
  ### Example
  
 ```
  	String url = "https://jsonplaceholder.typicode.com/posts"; //api url (get)
        Toaster toaster = new Toaster(this, url);
        toaster.geString(new Toaster.VolleyCallBack() {
            @Override
            public void onSuccess(String result) {
                toaster.s(result);
            }

            @Override
            public void onFailure(String msg) {
                toaster.s(msg);
            }
        });
 ```
