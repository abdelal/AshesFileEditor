package AshesEditor.utils.DS;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aki on 6/6/2017.
 */
public class MultiMapCase implements Multimap{

    ArrayListMultimap map=ArrayListMultimap.create();


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
       return map.isEmpty();
    }

    @Override
    public boolean containsKey(@Nullable Object key) {
        String keytemp=key.toString().toLowerCase();

        return map.containsKey(keytemp);

    }

    @Override
    public boolean containsValue(@Nullable Object value) {
        return map.containsValue(value);
    }

    @Override
    public boolean containsEntry(@Nullable Object key, @Nullable Object value) {
        String keytemp=key.toString().toLowerCase();
        return map.containsEntry(keytemp,value);
    }

    @Override
    public boolean put(@Nullable Object key, @Nullable Object value) {
        String keytemp=key.toString().toLowerCase();

        return map.put(keytemp,value);
    }

    @Override
    public boolean remove(@Nullable Object key, @Nullable Object value) {
        String keytemp=key.toString().toLowerCase();
       return map.remove(keytemp,value);
    }

    @Override
    public boolean putAll(@Nullable Object key, Iterable values) {
        String keytemp=key.toString().toLowerCase();
        return map.putAll(keytemp,values);
    }

    @Override
    public boolean putAll(Multimap multimap) {

        return map.putAll(multimap);
    }

    @Override
    public Collection replaceValues(@Nullable Object key, Iterable values) {
        return null;
    }

    @Override
    public Collection removeAll(@Nullable Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Collection get(@Nullable Object key) {
        return null;
    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Multiset keys() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Collection<Map.Entry> entries() {
        return null;
    }

    @Override
    public Map asMap() {
        return null;
    }
}
