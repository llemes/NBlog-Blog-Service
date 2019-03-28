package NBlog.DAL;

import NBlog.DataModel.BlogPost;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class BlogPostRepository implements NBlog.DAL.Interfaces.BlogPostRepository {
    @Override
    public BlogPost getByBlogPostId(int id) {
        return null;
    }

    @Override
    public List<BlogPost> findAll() {
        return null;
    }

    @Override
    public List<BlogPost> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<BlogPost> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<BlogPost> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(BlogPost blogPost) {

    }

    @Override
    public void deleteAll(Iterable<? extends BlogPost> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends BlogPost> S save(S s) {
        return null;
    }

    @Override
    public <S extends BlogPost> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<BlogPost> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends BlogPost> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<BlogPost> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BlogPost getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends BlogPost> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BlogPost> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BlogPost> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends BlogPost> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BlogPost> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BlogPost> boolean exists(Example<S> example) {
        return false;
    }
}
