SlideActionView is a simple widget that provides a nice slide-to-left/right interaction. This is a part of my efforts to modularize some of the things that I write; it was originally a part of [Alarmio](https://jfenn.me/projects/alarmio), and has been separated into its own library.

[![](https://jitpack.io/v/me.jfenn/SlideActionView.svg)](https://jitpack.io/#me.jfenn/SlideActionView)

For testing and experimentation purposes, a sample apk can be downloaded [here](https://jfenn.me/projects/slideactionview).

## Usage

### Setup

This project is published on [JitPack](https://jitpack.io), which you can add to your project by copying the following to your root build.gradle at the end of "repositories".

```gradle
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```

To add the dependency, copy this line into your app module's build.gradle file.

```gradle
implementation 'me.jfenn:SlideActionView:0.0.1'
```

### Basic Use

Adding the SlideActionView somewhere in your layout is fairly simple. Here is an example:

```xml
<me.jfenn.slideactionview.SlideActionView
  android:id="@+id/actionView"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_gravity="bottom" />
```

You will then want to specify icons for the left/right "slides". This can be done using the `setLeftIcon` and `setRightIcon` methods of the view. They accept both a `Drawable` and `Bitmap`, but it is more efficient to pass a `Bitmap` if possible.

```java
SlideActionView actionView = findViewById(R.id.actionView);
actionView.setLeftIcon(leftIconBitmap);
actionView.setRightIcon(rightIconBitmap);
```

In order to listen for the swipe actions, you must implement the `SlideActionListener` interface.

```java
actionView.setListener(new SlideActionView.SlideActionListener() {
  @Override
  public void onSlideLeft() {
    // slid left
  }
  
  @Override
  public void onSlideRight() {
    // slid right
  }
});
```

### Theming

There are several methods that you can call to specify different colors. I will not go into great detail of what they do, but it should be fairly obvious. `setTouchHandleColor` changes the color of the touch handle. `setOutlineColor` affects the outlines. `setIconColor` changes the filter applied to both icons.
