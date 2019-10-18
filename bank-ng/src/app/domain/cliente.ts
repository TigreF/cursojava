export class Cliente {
    
    constructor(
    public clieId:number,
	public  activo:String,
	public  direccion:String,
	public  email:String,
	public  fechaCreacion:Date,
	public  fechaModificacion:Date,
	public  nombre:String,
	public  telefono:String,
	public  usuCreador:String,
	public  usuModificador:String,
    public  tdocId:number
    ){}
}
