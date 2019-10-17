import { Component, OnInit } from '@angular/core';
import { ClienteService } from '../cliente.service';
import { Cliente } from '../cliente';

@Component({
  selector: 'app-cliente-list',
  templateUrl: './cliente-list.component.html',
  styleUrls: ['./cliente-list.component.css']
})
export class ClienteListComponent implements OnInit {

  public titulo: string;
  public listaCliente:Cliente[];
  constructor(public clienteService: ClienteService) {

   }

  ngOnInit() {

    this.titulo = 'Lista de clientes';
    this.listaCliente = this.clienteService.findAll();
  }

  public editar(cliente:Cliente)
  {
    console.table(cliente);
  }
}
