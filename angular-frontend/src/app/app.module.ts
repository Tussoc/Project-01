import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import {ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { AccountFormComponent } from './components/account-form/account-form.component';
import { AccountListComponent } from './components/account-list/account-list.component';
import { FlatFormComponent } from './components/flat-form/flat-form.component';
import { FlatListComponent } from './components/flat-list/flat-list.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    AccountFormComponent,
    AccountListComponent,
    FlatFormComponent,
    FlatListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
