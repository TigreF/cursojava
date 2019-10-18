import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TipoDocumentoService {

  public url: string;

  constructor(public httpCliente: HttpClient) {

    this.url = environment.apiUrl + 'tipoDocumento/';
  }


  public findAll(): Observable<any> {
    return this.httpCliente.get(this.url + 'findAll');
  }
}
