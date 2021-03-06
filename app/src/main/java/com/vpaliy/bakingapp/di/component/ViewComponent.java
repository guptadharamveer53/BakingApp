package com.vpaliy.bakingapp.di.component;

import com.vpaliy.bakingapp.di.module.PresenterModule;
import com.vpaliy.bakingapp.di.scope.ViewScope;
import com.vpaliy.bakingapp.ui.fragment.StepsFragment;
import com.vpaliy.bakingapp.ui.fragment.SummaryFragment;
import com.vpaliy.bakingapp.ui.fragment.RecipesFragment;

import dagger.Component;

@ViewScope
@Component(dependencies = ApplicationComponent.class,
        modules = {PresenterModule.class})
public interface ViewComponent {
    void inject(RecipesFragment fragment);
    void inject(SummaryFragment fragment);
    void inject(StepsFragment fragment);
}
