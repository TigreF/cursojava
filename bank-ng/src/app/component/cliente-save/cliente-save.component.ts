import { Component, OnInit } from '@angular/core';
import { Cliente } from 'src/app/domain/cliente';
import { TipoDocumento } from 'src/app/domain/tipo-documento';
import { Action } from 'rxjs/internal/scheduler/Action';
import { Activo } from 'src/app/domain/activo';
import { ClienteService } from 'src/app/service/cliente.service';
import { TipoDocumentoService } from 'src/app/service/tipo-documento.service';
import { ActivoService } from 'src/app/service/activo.service';

@Component({
  selector: 'app-cliente-save',
  templateUrl: './cliente-save.component.html',
  styleUrls: ['./cliente-save.component.css']
})
export class ClienteSaveComponent implements OnInit {
  public cliente: Cliente;
  public listaTipoDocumento: TipoDocumento[];
  public listaActivo: Activo[];

  public showMsg: boolean = false;
  public msg: string;
  constructor(public clienteService: ClienteService,
    public tipoDocumentoService: TipoDocumentoService,
    public activoService: ActivoService) { }

  ngOnInit() {
    this.cliente=new Cliente(0,"S","","",new Date(),new Date(),"","","","",1);
    this.findAllActivo();
    this.findAllTipoDocumento();

  }

  public findAllTipoDocumento() {
    this.tipoDocumentoService.findAll().subscribe(t => {
      this.listaTipoDocumento = t;
    });

  }

  public findAllActivo() {
    this.listaActivo = this.activoService.finfAll();
  }

}
