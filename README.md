
# react-native-page-curl

## Getting started

`$ npm install react-native-page-curl --save`

### Mostly automatic installation

`$ react-native link react-native-page-curl`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-page-curl` and add `RNReactNativePageCurl.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNReactNativePageCurl.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativePageCurlPackage;` to the imports at the top of the file
  - Add `new RNReactNativePageCurlPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-page-curl'
  	project(':react-native-page-curl').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-page-curl/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-page-curl')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNReactNativePageCurl.sln` in `node_modules/react-native-page-curl/windows/RNReactNativePageCurl.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using React.Native.Page.Curl.RNReactNativePageCurl;` to the usings at the top of the file
  - Add `new RNReactNativePageCurlPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNReactNativePageCurl from 'react-native-page-curl';

// TODO: What to do with the module?
RNReactNativePageCurl;
```
  
