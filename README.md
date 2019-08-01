布局悬停顶部效果
1.引入design库
implementation 'com.android.support:design:28.0.0'
2.加入布局
<android.support.design.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fitsSystemWindows="false">

    <android.support.design.widget.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="250dp">

        <android.support.design.widget.CollapsingToolbarLayout
            android:layout_width="match_parent"
            android:layout_height="220dp"
            app:contentScrim="#000000"
            app:layout_scrollFlags="scroll">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="220dp"
                android:background="#987545"
                android:gravity="center"
                android:text="banner区域"
                android:textColor="#ffffff" />

        </android.support.design.widget.CollapsingToolbarLayout>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="30dp"
            android:gravity="center"
            android:text="悬浮的部分" />

    </android.support.design.widget.AppBarLayout>

    <android.support.v4.widget.NestedScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal"
            android:lineSpacingExtra="100dp"
            android:text="1\n2\n3\n4\n5\n6\n7\n8\n9\n10" />

    </android.support.v4.widget.NestedScrollView>

</android.support.design.widget.CoordinatorLayout>