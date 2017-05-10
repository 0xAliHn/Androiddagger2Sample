package com.android.dagger2.di.component;

import com.android.dagger2.MainActivity;
import com.android.dagger2.di.PerActivity;
import com.android.dagger2.di.module.ActivityModule;

import dagger.Component;


@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
