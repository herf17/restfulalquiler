import { Component, OnInit } from '@angular/core';
//.import {AutosApiService} from '../autos-api.service';
import {autos} from '../autos';

@Component({
  selector: 'app-autos',
  templateUrl: './autos.component.html',
  styleUrls: ['./autos.component.css']
})
export class AutosComponent implements OnInit {
  autos: autos[] = [];

  constructor(/*private autosServicio: AutosApiService*/) { }

  ngOnInit(): void {
    //this.getauto();
  }

  /*getauto():void{
    this.autosServicio.getautos().subscribe(auto =>this.autos = auto);
  }*/


}
