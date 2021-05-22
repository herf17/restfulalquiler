import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {autos} from '../app/autos'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AutosApiService {

  urlapi = 'http://localhost:8080/todo';

  constructor(private http : HttpClient) { }

  getautos(): Observable<autos[]>{
    return this.http.get<autos[]>(this.urlapi);

  }
}
