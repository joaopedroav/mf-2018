import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ClarityModule } from '@clr/angular';
import { HttpClientModule } from '@angular/common/http';
import { AgmCoreModule } from '@agm/core';

import { AppComponent } from './app.component';

@NgModule({
  imports: [BrowserModule, FormsModule, ClarityModule, HttpClientModule, AgmCoreModule.forRoot({
    apiKey: ''
  })],
  declarations: [AppComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
