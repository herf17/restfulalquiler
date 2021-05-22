import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AlquilarComponent} from './alquilar/alquilar.component'
import {AutosComponent} from './autos/autos.component'


const rutas : Routes = [
  {path: '', component: AutosComponent},
  {path: '', component: AlquilarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(rutas)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
