package com.android.dagger2.di.component;

import android.app.Application;
import android.content.Context;

import com.android.dagger2.DemoApplication;
import com.android.dagger2.data.DataManager;
import com.android.dagger2.data.DbHelper;
import com.android.dagger2.data.SharedPrefsHelper;
import com.android.dagger2.di.ApplicationContext;
import com.android.dagger2.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
