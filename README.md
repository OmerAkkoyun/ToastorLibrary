# ToastorLibrary
# > This is for my TEST library

Simple toast library
> Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
>Step 2. Add the dependency
```gradle
dependencies {
	        implementation 'com.github.OmerAkkoyun:ToastorLibrary:1.1'
	}
```



Toastor.toast1(this, "Merhaba TOASTOR")
