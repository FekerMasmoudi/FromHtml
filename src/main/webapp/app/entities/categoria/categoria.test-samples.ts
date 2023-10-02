import { ICategoria, NewCategoria } from './categoria.model';

export const sampleWithRequiredData: ICategoria = {
  id: '54a07226-f53a-462a-b8f4-97bc63ed43d9',
};

export const sampleWithPartialData: ICategoria = {
  id: '3b71948c-a8b3-433b-83e4-efa64f7e472b',
  name: 'infrastructures',
};

export const sampleWithFullData: ICategoria = {
  id: '55cd99e1-fd31-4f57-90df-9c3e6cc53469',
  name: 'Loaf Accountability Account',
  subcategoria: 'Assurance Rubber',
};

export const sampleWithNewData: NewCategoria = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
