package com.example.application.views.bombki;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Bombki")
@Route(value = "Bombki", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Tag("bombki-view")
@JsModule("./views/bombki/bombki-view.ts")
public class BombkiView extends LitTemplate implements HasStyle {

    public BombkiView() {
        addClassNames("flex", "flex-col", "h-full");
    }
}
