import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EstabelecimentosApiService {

  private URL = 'assets/estabelecimentos.json'

  constructor(private http: HttpClient) { }

  getEstabelecimentos(): Observable<any> {
    return this.http.get(this.URL);
  }
}
