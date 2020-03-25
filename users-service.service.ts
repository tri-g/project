import { Injectable } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import {ProductInformation} from "./product-information";
import{catchError} from 'rxjs/operators';
import { Users } from './users';

@Injectable({
  providedIn: 'root'
})
export class UsersServiceService {
	private baseUrl = 'http://localhost:8080/users'
  private baseUrl1 = 'http://localhost:8080/products'
  private baseUrl2 = 'http://localhost:8080/details'
  private baseUrl3= 'http://localhost:8080/cart'
  private baseUrl4= 'http://localhost:8080/products1'
  private baseUrl5= 'http://localhost:8080/products2'
  private baseUrl6= 'http://localhost:8080/products3'
  private baseUrl7= 'http://localhost:8080/products4'
  private baseUrl8='http://localhost:8080/Customer'
  private baseUrl9 = 'http://localhost:8080/products'

  constructor(private http: HttpClient,private userService: UsersServiceService) { }

  updateCustomer(id:number, value:any):Observable<Object>
  {
    return this.http.put(`${this.baseUrl8}/${id}`, value);
  }

  deletecustomer(id:number):Observable<any>
  {
    return this.http.delete(`${this.baseUrl8}/${id}`,{responseType:'text'});
  }


  getcartpage(id:string,name:string,desc:string,price:string,img:string):Observable<any> 
{
  return this.http.get(`${this.baseUrl3}/`+id+'/'+name+'/'+desc+'/'+price+'/'+img);
}
 
getproductid(id:string,name:string,desc:string,price:string,img:string):Observable<any> 
{
  return this.http.get(`${this.baseUrl2}/`+id+'/'+name+'/'+desc+'/'+price+'/'+img);
}
createUser(user: Object): Observable<Object>
 {
  		return this.http.post(`${this.baseUrl}`,user);
}
  loginValidation(name,password){
  		return this.http.get('http://localhost:8080/users/'+name+'/'+password);
    }
   
     getProductList(): Observable<any> {
    return this.http.get(`${this.baseUrl1}`);
}
 getProductList0(): Observable<any> {
    return this.http.get(`${this.baseUrl4}/`);
}
getProductList1(): Observable<any> {
    return this.http.get(`${this.baseUrl5}/`);
}
getProductList2(): Observable<any> {
    return this.http.get(`${this.baseUrl6}/`);
}
getProductList3(): Observable<any> {
    return this.http.get(`${this.baseUrl7}/`);
}

getProductUpdate(id:number):Observable<any>{
    return this.http.get('http://localhost:8080/product/${id}');
  }

   updateProduct(id:number, value:any):Observable<Object>{
    return this.http.put(`${this.baseUrl9}/${id}`,value);
  }

  deleteProduct(id:number):Observable<any>{
    return this.http.delete(`${this.baseUrl9}/${id}`,{responseType:'text'});
  }

  createProduct(product: Object): Observable<Object>{
    return this.http.post('http://localhost:8080/productadd', product);
  }

  productDetails(id:number):Observable<any>{
    return this.http.get('http://localhost:8080/details/${id}');
  }
  getProduct():Observable<any>{
    return this.http.get('http://localhost:8080/product');
  }
  }