import { Injectable } from '@angular/core';
import { Cliente } from './cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  public listaCliente:Cliente[];

  constructor() {
    this.listaCliente=[
      {id:45,nombre:'max power',email:'juan.power@gmail.com'},
      {id:46,nombre:'min power',email:'juan.power@gmail.com'},
      {id:47,nombre:'max Louder',email:'juan.power@gmail.com'},
      {id:48,nombre:'min Louder',email:'juan.power@gmail.com'}
    ];
   }

public findAll():Cliente[]{
  return this.listaCliente;
}

}
