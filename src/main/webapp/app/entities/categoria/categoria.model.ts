export interface ICategoria {
  id: string;
  name?: string | null;
  subcategoria?: string | null;
}

export type NewCategoria = Omit<ICategoria, 'id'> & { id: null };
