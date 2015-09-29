/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ozone.service.Impl;

import ozone.domain.Contact;
import ozone.service.ContactService;
import java.util.List;

/**
 *
 * @author boniface
 */
public class ContactServiceImpl  implements  ContactService{

    @Override
    public Contact find(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void persist(Contact entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void merge(Contact entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Contact entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Contact> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Contact> findInRange(int firstResult, int maxResults) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Contact getByPropertyName(String propertyName, String propertyValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Contact> getEntitiesByProperName(String propertyName, String propertyValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
